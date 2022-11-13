import android.opengl.EGLContext;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.DismissSuggestedActionController$1;
import android.view.ViewGroup$MarginLayoutParams;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfz implements atke
{
    public final Object a;
    private final int b;
    
    public jfz(final aaqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final Context a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final ViewGroup$MarginLayoutParams a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final arkg a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final atke a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final jgb a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final jgo a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final kra a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final krk a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final krq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final lik a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final lpq a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final oud a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final tye a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public jfz(final yub a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final Object a() {
        final int b = this.b;
        final boolean b2 = true;
        final boolean b3 = true;
        boolean b4 = true;
        switch (b) {
            default: {
                return ((aaqz)this.a).f.c();
            }
            case 19: {
                return ((Context)this.a).getSharedPreferences("DelayedEventMetricsStore.prefs", 0);
            }
            case 18: {
                return ((yub)this.a).c;
            }
            case 17: {
                return this.a;
            }
            case 16: {
                return this.a;
            }
            case 15: {
                return this.a;
            }
            case 14: {
                return this.a;
            }
            case 13: {
                return this.a;
            }
            case 12: {
                final uon o = ((tye)this.a).o;
                o.getClass();
                final EGLContext q = o.q();
                q.getClass();
                return new tyd(q, new rcq());
            }
            case 11: {
                final Object a = this.a;
                if (((aezp)((atke)a).a()).h() && ((qcs)((aezp)((atke)a).a()).c()).b() != null) {
                    final atke b5 = ((qcs)((aezp)((atke)a).a()).c()).b();
                    b5.getClass();
                    return b5.a();
                }
                return null;
            }
            case 10: {
                return this.a;
            }
            case 9: {
                return ((lpq)this.a).c();
            }
            case 8: {
                return ((iaw)((arkg)this.a).a()).b();
            }
            case 7: {
                return new DismissSuggestedActionController$1((jcs)((atke)this.a).a());
            }
            case 6: {
                return ((lhq)((lik)this.a).b.a()).k();
            }
            case 5: {
                return ((wyy)((krp)this.a).j).a;
            }
            case 4: {
                return ((wyy)((krp)this.a).j).a;
            }
            case 3: {
                return ((kra)this.a).q;
            }
            case 2: {
                final Boolean c = ((jgo)this.a).c;
                if (c == null || c) {
                    b4 = false;
                }
                return b4;
            }
            case 1: {
                final Boolean p = ((jgb)this.a).P;
                return p != null && !p && b2;
            }
            case 0: {
                return ((jgb)this.a).b() > 0 && b3;
            }
        }
    }
}
