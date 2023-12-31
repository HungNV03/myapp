// Generated by view binder compiler. Do not edit!
package fpoly.edu.du_an_1_pd06861.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import fpoly.edu.du_an_1_pd06861.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChangepassBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnCancelUserChange;

  @NonNull
  public final Button btnSaveUserChange;

  @NonNull
  public final TextInputEditText edPassChange;

  @NonNull
  public final TextInputEditText edPassOld;

  @NonNull
  public final TextInputEditText edRePassChange;

  private FragmentChangepassBinding(@NonNull LinearLayout rootView,
      @NonNull Button btnCancelUserChange, @NonNull Button btnSaveUserChange,
      @NonNull TextInputEditText edPassChange, @NonNull TextInputEditText edPassOld,
      @NonNull TextInputEditText edRePassChange) {
    this.rootView = rootView;
    this.btnCancelUserChange = btnCancelUserChange;
    this.btnSaveUserChange = btnSaveUserChange;
    this.edPassChange = edPassChange;
    this.edPassOld = edPassOld;
    this.edRePassChange = edRePassChange;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChangepassBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChangepassBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_changepass, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChangepassBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancelUserChange;
      Button btnCancelUserChange = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelUserChange == null) {
        break missingId;
      }

      id = R.id.btnSaveUserChange;
      Button btnSaveUserChange = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveUserChange == null) {
        break missingId;
      }

      id = R.id.edPassChange;
      TextInputEditText edPassChange = ViewBindings.findChildViewById(rootView, id);
      if (edPassChange == null) {
        break missingId;
      }

      id = R.id.edPassOld;
      TextInputEditText edPassOld = ViewBindings.findChildViewById(rootView, id);
      if (edPassOld == null) {
        break missingId;
      }

      id = R.id.edRePassChange;
      TextInputEditText edRePassChange = ViewBindings.findChildViewById(rootView, id);
      if (edRePassChange == null) {
        break missingId;
      }

      return new FragmentChangepassBinding((LinearLayout) rootView, btnCancelUserChange,
          btnSaveUserChange, edPassChange, edPassOld, edRePassChange);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
