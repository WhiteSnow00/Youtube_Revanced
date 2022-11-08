import android.view.View;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import android.widget.ImageView;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import android.content.res.ColorStateList;
import android.view.ViewStub;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kds
{
    public final aceo a;
    public final acng b;
    public final Context c;
    public final ViewStub d;
    public final ViewStub e;
    public final ViewStub f;
    public final ViewStub g;
    public final ColorStateList h;
    public CircularImageView i;
    public FrameLayout j;
    public ImageView k;
    public ImageView l;
    public TintableImageView m;
    public final uyi n;
    
    public kds(final aceo a, final acng b, final uyi n, final View view) {
        this.a = a;
        this.b = b;
        this.n = n;
        final Context context = view.getContext();
        this.c = context;
        this.d = (ViewStub)view.findViewById(2131428204);
        this.e = (ViewStub)view.findViewById(2131428551);
        this.f = (ViewStub)view.findViewById(2131431670);
        this.g = (ViewStub)view.findViewById(2131429272);
        this.h = tmy.cp(context, 2130970924);
        this.i = (CircularImageView)view.findViewById(2131428203);
        this.j = (FrameLayout)view.findViewById(2131428550);
        this.l = (ImageView)view.findViewById(2131431669);
        this.m = (TintableImageView)view.findViewById(2131429271);
    }
    
    public static akbf a(final aite aite) {
        if (aite != null && (aite.b & 0x80) != 0x0) {
            akbh akbh;
            if ((akbh = aite.f) == null) {
                akbh = akbh.a;
            }
            akbf akbf;
            if ((akbf = akbh.c) == null) {
                akbf = akbf.a;
            }
            return akbf;
        }
        return null;
    }
    
    public static aorm b(final aite aite) {
        if (aite != null && (aite.b & 0x1) != 0x0) {
            aiia aiia;
            if ((aiia = aite.c) == null) {
                aiia = aiia.a;
            }
            aorm aorm;
            if ((aorm = aiia.b) == null) {
                aorm = aorm.a;
            }
            return aorm;
        }
        return null;
    }
    
    public static aorm c(final aite aite) {
        if (aite != null && (aite.b & 0x2) != 0x0) {
            anie anie;
            if ((anie = aite.d) == null) {
                anie = anie.a;
            }
            aorm aorm;
            if ((aorm = anie.c) == null) {
                aorm = aorm.a;
            }
            return aorm;
        }
        return null;
    }
    
    public static aorm d(final aite aite) {
        if (aite != null && (aite.b & 0x4) != 0x0) {
            anif anif;
            if ((anif = aite.e) == null) {
                anif = anif.a;
            }
            aorm aorm;
            if ((aorm = anif.b) == null) {
                aorm = aorm.a;
            }
            return aorm;
        }
        return null;
    }
}
