package `in`.fittro.management.onboarding.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import `in`.fittro.management.R
import `in`.fittro.management.onboarding.auth.viewmodel.LoginViewModel
import `in`.fittro.management.onboarding.createcenter.CreateCenterActivity
import `in`.fittro.management.databinding.FragmentLoginBinding
import `in`.fittro.retrofit.NetworkState
import timber.log.Timber

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<LoginViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clicks()
        getObserver()


    }

    private fun getObserver() {
        viewModel.loginLivedata.observe(requireActivity()) {
            when (it) {
                is NetworkState.Error -> {
                    Timber.e(it.error?.message.toString())
                }

                is NetworkState.Loading -> {}

                is NetworkState.Success -> {
                    Toast.makeText(requireContext(), "Success Fully Login", Toast.LENGTH_SHORT)
                        .show()
                    Timber.i("Success Fully Login")
                    startActivity(Intent(requireContext(), CreateCenterActivity::class.java))
                }
            }
        }
    }

    private fun clicks() {

        // Login Button Click
        binding.btnLogin.setOnClickListener {
            binding.apply {
                viewModel.login(edEmail.text.toString(), edPassword.text.toString())
            }
        }

        // Registration Button Click
        binding.tvRegistration.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_registrationFragment)
        }
    }
}