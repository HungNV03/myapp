// Generated by view binder compiler. Do not edit!
package fpoly.edu.du_an_1_pd06861.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import fpoly.edu.du_an_1_pd06861.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogChinhsuaNhanvienBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edChucvu;

  @NonNull
  public final EditText edTennv;

  @NonNull
  public final TextView txtIdnv;

  private DialogChinhsuaNhanvienBinding(@NonNull LinearLayout rootView, @NonNull EditText edChucvu,
      @NonNull EditText edTennv, @NonNull TextView txtIdnv) {
    this.rootView = rootView;
    this.edChucvu = edChucvu;
    this.edTennv = edTennv;
    this.txtIdnv = txtIdnv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogChinhsuaNhanvienBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogChinhsuaNhanvienBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_chinhsua_nhanvien, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogChinhsuaNhanvienBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edChucvu;
      EditText edChucvu = ViewBindings.findChildViewById(rootView, id);
      if (edChucvu == null) {
        break missingId;
      }

      id = R.id.edTennv;
      EditText edTennv = ViewBindings.findChildViewById(rootView, id);
      if (edTennv == null) {
        break missingId;
      }

      id = R.id.txtIdnv;
      TextView txtIdnv = ViewBindings.findChildViewById(rootView, id);
      if (txtIdnv == null) {
        break missingId;
      }

      return new DialogChinhsuaNhanvienBinding((LinearLayout) rootView, edChucvu, edTennv, txtIdnv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}