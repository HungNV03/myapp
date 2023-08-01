// Generated by view binder compiler. Do not edit!
package fpoly.edu.du_an_1_pd06861.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import fpoly.edu.du_an_1_pd06861.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentDuAnBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSua;

  @NonNull
  public final Button btnThem;

  @NonNull
  public final EditText edthemda;

  @NonNull
  public final RecyclerView rcvDuan;

  private FragmentDuAnBinding(@NonNull LinearLayout rootView, @NonNull Button btnSua,
      @NonNull Button btnThem, @NonNull EditText edthemda, @NonNull RecyclerView rcvDuan) {
    this.rootView = rootView;
    this.btnSua = btnSua;
    this.btnThem = btnThem;
    this.edthemda = edthemda;
    this.rcvDuan = rcvDuan;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentDuAnBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentDuAnBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_du_an, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentDuAnBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSua;
      Button btnSua = ViewBindings.findChildViewById(rootView, id);
      if (btnSua == null) {
        break missingId;
      }

      id = R.id.btnThem;
      Button btnThem = ViewBindings.findChildViewById(rootView, id);
      if (btnThem == null) {
        break missingId;
      }

      id = R.id.edthemda;
      EditText edthemda = ViewBindings.findChildViewById(rootView, id);
      if (edthemda == null) {
        break missingId;
      }

      id = R.id.rcvDuan;
      RecyclerView rcvDuan = ViewBindings.findChildViewById(rootView, id);
      if (rcvDuan == null) {
        break missingId;
      }

      return new FragmentDuAnBinding((LinearLayout) rootView, btnSua, btnThem, edthemda, rcvDuan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
