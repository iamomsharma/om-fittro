// Generated by view binder compiler. Do not edit!
package in.fittro.management.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import in.fittro.management.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCenterInfoBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatImageView appCompatImageView11;

  @NonNull
  public final ConstraintLayout btnSubmit;

  @NonNull
  public final AppCompatEditText edCity;

  @NonNull
  public final AppCompatEditText edCountry;

  @NonNull
  public final AppCompatEditText edEmail;

  @NonNull
  public final AppCompatEditText edFacebook;

  @NonNull
  public final AppCompatEditText edGender;

  @NonNull
  public final AppCompatEditText edGymName;

  @NonNull
  public final AppCompatEditText edInstagram;

  @NonNull
  public final AppCompatEditText edPassword;

  @NonNull
  public final AppCompatEditText edState;

  @NonNull
  public final AppCompatEditText edWebsite;

  @NonNull
  public final AppCompatEditText edYoutube;

  @NonNull
  public final LinearLayout linearLayout4;

  @NonNull
  public final LinearLayout llLink;

  @NonNull
  public final ToolbarBinding toolbar;

  @NonNull
  public final AppCompatTextView tvSocialMedia;

  private FragmentCenterInfoBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatImageView appCompatImageView11, @NonNull ConstraintLayout btnSubmit,
      @NonNull AppCompatEditText edCity, @NonNull AppCompatEditText edCountry,
      @NonNull AppCompatEditText edEmail, @NonNull AppCompatEditText edFacebook,
      @NonNull AppCompatEditText edGender, @NonNull AppCompatEditText edGymName,
      @NonNull AppCompatEditText edInstagram, @NonNull AppCompatEditText edPassword,
      @NonNull AppCompatEditText edState, @NonNull AppCompatEditText edWebsite,
      @NonNull AppCompatEditText edYoutube, @NonNull LinearLayout linearLayout4,
      @NonNull LinearLayout llLink, @NonNull ToolbarBinding toolbar,
      @NonNull AppCompatTextView tvSocialMedia) {
    this.rootView = rootView;
    this.appCompatImageView11 = appCompatImageView11;
    this.btnSubmit = btnSubmit;
    this.edCity = edCity;
    this.edCountry = edCountry;
    this.edEmail = edEmail;
    this.edFacebook = edFacebook;
    this.edGender = edGender;
    this.edGymName = edGymName;
    this.edInstagram = edInstagram;
    this.edPassword = edPassword;
    this.edState = edState;
    this.edWebsite = edWebsite;
    this.edYoutube = edYoutube;
    this.linearLayout4 = linearLayout4;
    this.llLink = llLink;
    this.toolbar = toolbar;
    this.tvSocialMedia = tvSocialMedia;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCenterInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCenterInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_center_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCenterInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appCompatImageView11;
      AppCompatImageView appCompatImageView11 = ViewBindings.findChildViewById(rootView, id);
      if (appCompatImageView11 == null) {
        break missingId;
      }

      id = R.id.btnSubmit;
      ConstraintLayout btnSubmit = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmit == null) {
        break missingId;
      }

      id = R.id.edCity;
      AppCompatEditText edCity = ViewBindings.findChildViewById(rootView, id);
      if (edCity == null) {
        break missingId;
      }

      id = R.id.edCountry;
      AppCompatEditText edCountry = ViewBindings.findChildViewById(rootView, id);
      if (edCountry == null) {
        break missingId;
      }

      id = R.id.edEmail;
      AppCompatEditText edEmail = ViewBindings.findChildViewById(rootView, id);
      if (edEmail == null) {
        break missingId;
      }

      id = R.id.edFacebook;
      AppCompatEditText edFacebook = ViewBindings.findChildViewById(rootView, id);
      if (edFacebook == null) {
        break missingId;
      }

      id = R.id.edGender;
      AppCompatEditText edGender = ViewBindings.findChildViewById(rootView, id);
      if (edGender == null) {
        break missingId;
      }

      id = R.id.edGymName;
      AppCompatEditText edGymName = ViewBindings.findChildViewById(rootView, id);
      if (edGymName == null) {
        break missingId;
      }

      id = R.id.edInstagram;
      AppCompatEditText edInstagram = ViewBindings.findChildViewById(rootView, id);
      if (edInstagram == null) {
        break missingId;
      }

      id = R.id.edPassword;
      AppCompatEditText edPassword = ViewBindings.findChildViewById(rootView, id);
      if (edPassword == null) {
        break missingId;
      }

      id = R.id.edState;
      AppCompatEditText edState = ViewBindings.findChildViewById(rootView, id);
      if (edState == null) {
        break missingId;
      }

      id = R.id.edWebsite;
      AppCompatEditText edWebsite = ViewBindings.findChildViewById(rootView, id);
      if (edWebsite == null) {
        break missingId;
      }

      id = R.id.edYoutube;
      AppCompatEditText edYoutube = ViewBindings.findChildViewById(rootView, id);
      if (edYoutube == null) {
        break missingId;
      }

      id = R.id.linearLayout4;
      LinearLayout linearLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout4 == null) {
        break missingId;
      }

      id = R.id.llLink;
      LinearLayout llLink = ViewBindings.findChildViewById(rootView, id);
      if (llLink == null) {
        break missingId;
      }

      id = R.id.toolbar;
      View toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }
      ToolbarBinding binding_toolbar = ToolbarBinding.bind(toolbar);

      id = R.id.tvSocialMedia;
      AppCompatTextView tvSocialMedia = ViewBindings.findChildViewById(rootView, id);
      if (tvSocialMedia == null) {
        break missingId;
      }

      return new FragmentCenterInfoBinding((ScrollView) rootView, appCompatImageView11, btnSubmit,
          edCity, edCountry, edEmail, edFacebook, edGender, edGymName, edInstagram, edPassword,
          edState, edWebsite, edYoutube, linearLayout4, llLink, binding_toolbar, tvSocialMedia);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}