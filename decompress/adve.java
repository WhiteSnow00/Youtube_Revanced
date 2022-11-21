import com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import com.google.android.material.button.MaterialButton$SavedState;
import com.google.android.material.internal.CheckableImageButton$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.navigation.NavigationView$SavedState;
import com.google.android.material.stateful.ExtendableSavedState;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adve implements Parcelable$ClassLoaderCreator
{
    private final int a;
    
    public adve(final int a) {
        this.a = a;
    }
    
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.a) {
            default: {
                return new TextInputLayout$SavedState(parcel, (ClassLoader)null);
            }
            case 6: {
                return new ExtendableSavedState(parcel, (ClassLoader)null);
            }
            case 5: {
                return new NavigationView$SavedState(parcel, (ClassLoader)null);
            }
            case 4: {
                return new ParcelableSparseArray(parcel, (ClassLoader)null);
            }
            case 3: {
                return new CheckableImageButton$SavedState(parcel, (ClassLoader)null);
            }
            case 2: {
                return new MaterialButton$SavedState(parcel, (ClassLoader)null);
            }
            case 1: {
                return new AppBarLayout$BaseBehavior$SavedState(parcel, (ClassLoader)null);
            }
            case 0: {
                return new BottomSheetBehavior$SavedState(parcel, (ClassLoader)null);
            }
        }
    }
    
    public final Object createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        switch (this.a) {
            default: {
                return new TextInputLayout$SavedState(parcel, classLoader);
            }
            case 6: {
                return new ExtendableSavedState(parcel, classLoader);
            }
            case 5: {
                return new NavigationView$SavedState(parcel, classLoader);
            }
            case 4: {
                return new ParcelableSparseArray(parcel, classLoader);
            }
            case 3: {
                return new CheckableImageButton$SavedState(parcel, classLoader);
            }
            case 2: {
                return new MaterialButton$SavedState(parcel, classLoader);
            }
            case 1: {
                return new AppBarLayout$BaseBehavior$SavedState(parcel, classLoader);
            }
            case 0: {
                return new BottomSheetBehavior$SavedState(parcel, classLoader);
            }
        }
    }
    
    public final Object[] newArray(final int n) {
        switch (this.a) {
            default: {
                return new TextInputLayout$SavedState[n];
            }
            case 6: {
                return new ExtendableSavedState[n];
            }
            case 5: {
                return new NavigationView$SavedState[n];
            }
            case 4: {
                return new ParcelableSparseArray[n];
            }
            case 3: {
                return new CheckableImageButton$SavedState[n];
            }
            case 2: {
                return new MaterialButton$SavedState[n];
            }
            case 1: {
                return new AppBarLayout$BaseBehavior$SavedState[n];
            }
            case 0: {
                return new BottomSheetBehavior$SavedState[n];
            }
        }
    }
}
