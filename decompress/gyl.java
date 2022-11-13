import com.google.android.libraries.youtube.offline.ui.DownloadNetworkSelectionDialogPreference;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyl implements DialogInterface$OnClickListener
{
    public static final gyl a;
    public static final gyl b;
    public static final gyl c;
    public static final gyl d;
    public static final gyl e;
    public static final gyl f;
    public static final gyl g;
    public static final gyl h;
    public static final gyl i;
    public static final gyl j;
    public static final gyl k;
    public static final gyl l;
    private final int m;
    
    static {
        l = new gyl(17);
        k = new gyl(16);
        j = new gyl(15);
        i = new gyl(14);
        h = new gyl(9);
        g = new gyl(7);
        f = new gyl(6);
        e = new gyl(5);
        d = new gyl(3);
        c = new gyl(2);
        b = new gyl(1);
        a = new gyl(0);
    }
    
    public gyl(final int m) {
        this.m = m;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        switch (this.m) {
            default: {
                dialogInterface.cancel();
                return;
            }
            case 17:
            case 18: {
                return;
            }
            case 16: {
                dialogInterface.cancel();
                return;
            }
            case 15: {
                final afeq a = DownloadNetworkSelectionDialogPreference.a;
                dialogInterface.dismiss();
                return;
            }
            case 14: {
                dialogInterface.dismiss();
                return;
            }
            case 13: {
                throw null;
            }
            case 12: {
                dialogInterface.dismiss();
                return;
            }
            case 11: {
                dialogInterface.dismiss();
                return;
            }
            case 10: {
                dialogInterface.dismiss();
                return;
            }
            case 9: {
                dialogInterface.dismiss();
                return;
            }
            case 8: {
                dialogInterface.cancel();
                return;
            }
            case 7: {
                dialogInterface.dismiss();
                return;
            }
            case 6: {
                dialogInterface.dismiss();
                return;
            }
            case 5: {
                dialogInterface.dismiss();
                return;
            }
            case 4: {
                dialogInterface.dismiss();
                return;
            }
            case 3: {
                dialogInterface.dismiss();
                return;
            }
            case 2: {
                dialogInterface.dismiss();
            }
            case 1: {
                return;
            }
            case 0: {
                dialogInterface.dismiss();
            }
        }
    }
}
