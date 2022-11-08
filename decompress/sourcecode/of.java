import android.support.v7.widget.RecyclerView$SavedState;
import android.support.v4.app.Fragment$SavedState;
import android.support.v7.widget.SearchView$SavedState;
import android.support.v7.widget.Toolbar$SavedState;
import androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState;
import androidx.viewpager.widget.ViewPager$SavedState;
import androidx.customview.view.AbsSavedState;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class of implements Parcelable$ClassLoaderCreator
{
    private final /* synthetic */ int a;
    
    public of(final int a) {
        this.a = a;
    }
    
    public static final AbsSavedState a(final Parcel parcel, final ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return AbsSavedState.c;
        }
        throw new IllegalStateException("superState must be null");
    }
}
