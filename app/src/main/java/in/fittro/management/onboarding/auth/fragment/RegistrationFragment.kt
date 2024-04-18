package `in`.fittro.management.onboarding.auth.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import `in`.fittro.management.databinding.FragmentRegistrationBinding
import `in`.fittro.management.onboarding.auth.viewmodel.RegistrationViewModel
import `in`.fittro.retrofit.NetworkState
import timber.log.Timber

class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    private val viewModel by viewModels<RegistrationViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        clickFunction()
        getObserver()

    }

    private fun clickFunction() {
        binding.btnSubmit.setOnClickListener {
            binding.apply {
                viewModel.registration(
                    edName.text.toString(), edEmail.text.toString(),
                    edPassword.text.toString(), edGender.text.toString(), edPhone.text.toString()
                )
            }
            startActivity(Intent(requireActivity(), LoginFragment::class.java))
        }
    }

    private fun getObserver() {
        viewModel.registrationLivedata.observe(requireActivity()) {
            when (it) {
                is NetworkState.Error -> {
                    Timber.e(it.error?.message.toString())
                }

                is NetworkState.Loading -> {}

                is NetworkState.Success -> {
                    Toast.makeText(
                        requireContext(),
                        "Success Fully Registration.",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                    startActivity(Intent(requireContext(), LoginFragment::class.java))
                }
            }
        }
    }
}