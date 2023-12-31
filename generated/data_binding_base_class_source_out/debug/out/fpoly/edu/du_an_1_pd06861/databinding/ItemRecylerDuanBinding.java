// Generated by view binder compiler. Do not edit!
package fpoly.edu.du_an_1_pd06861.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import fpoly.edu.du_an_1_pd06861.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemRecylerDuanBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivEdit;

  @NonNull
  public final ImageView ivXoa;

  @NonNull
  public final TextView tvIdda;

  @NonNull
  public final TextView tvTenduan;

  private ItemRecylerDuanBinding(@NonNull CardView rootView, @NonNull ImageView ivEdit,
      @NonNull ImageView ivXoa, @NonNull TextView tvIdda, @NonNull TextView tvTenduan) {
    this.rootView = rootView;
    this.ivEdit = ivEdit;
    this.ivXoa = ivXoa;
    this.tvIdda = tvIdda;
    this.tvTenduan = tvTenduan;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemRecylerDuanBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemRecylerDuanBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_recyler_duan, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemRecylerDuanBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivEdit;
      ImageView ivEdit = ViewBindings.findChildViewById(rootView, id);
      if (ivEdit == null) {
        break missingId;
      }

      id = R.id.ivXoa;
      ImageView ivXoa = ViewBindings.findChildViewById(rootView, id);
      if (ivXoa == null) {
        break missingId;
      }

      id = R.id.tvIdda;
      TextView tvIdda = ViewBindings.findChildViewById(rootView, id);
      if (tvIdda == null) {
        break missingId;
      }

      id = R.id.tvTenduan;
      TextView tvTenduan = ViewBindings.findChildViewById(rootView, id);
      if (tvTenduan == null) {
        break missingId;
      }

      return new ItemRecylerDuanBinding((CardView) rootView, ivEdit, ivXoa, tvIdda, tvTenduan);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
