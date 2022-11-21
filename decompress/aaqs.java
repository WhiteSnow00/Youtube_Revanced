import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Collection;
import j$.util.Collection$_EL;
import java.util.function.Function;
import j$.util.DesugarArrays;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaqs implements asmn
{
    public static final aaqs a;
    public static final aaqs b;
    public static final aaqs c;
    public static final aaqs d;
    public static final aaqs e;
    public static final aaqs f;
    public static final aaqs g;
    public static final aaqs h;
    public static final aaqs i;
    public static final aaqs j;
    public static final aaqs k;
    public static final aaqs l;
    public static final aaqs m;
    public static final aaqs n;
    public static final aaqs o;
    public static final aaqs p;
    public static final aaqs q;
    public static final aaqs r;
    public static final aaqs s;
    public static final aaqs t;
    private final int u;
    
    static {
        t = new aaqs(20);
        s = new aaqs(19);
        r = new aaqs(18);
        q = new aaqs(17);
        p = new aaqs(16);
        o = new aaqs(15);
        n = new aaqs(14);
        m = new aaqs(13);
        l = new aaqs(12);
        k = new aaqs(11);
        j = new aaqs(10);
        i = new aaqs(9);
        h = new aaqs(8);
        g = new aaqs(7);
        f = new aaqs(6);
        e = new aaqs(5);
        d = new aaqs(4);
        c = new aaqs(3);
        b = new aaqs(2);
        a = new aaqs(0);
    }
    
    public aaqs(final int u) {
        this.u = u;
    }
    
    @Override
    public final Object a(final Object o) {
        switch (this.u) {
            default: {
                return ((adzx)o).a;
            }
            case 19: {
                final aapc aapc = (aapc)o;
                return true;
            }
            case 18: {
                return aamz.ad(o);
            }
            case 17: {
                return aamz.ad(o);
            }
            case 16: {
                return aamz.ad(o);
            }
            case 15: {
                return ((aapv)o).a().Y();
            }
            case 14: {
                tut.f("WillAutonavInformer", "Error retrieving isAutoNavDisabled, assuming restricted.", (Throwable)o);
                return false;
            }
            case 13: {
                final acav a = ((aapv)o).a();
                return a.x().L((asmn)new zgh(a, 13));
            }
            case 12: {
                return ((aqtx)o).d;
            }
            case 11: {
                return ((aapp)o).c().a(abll.d, abll.e, abll.f);
            }
            case 10: {
                return ((afbh)o).c();
            }
            case 9: {
                return ((aapp)o).c().a(abll.d, abll.e, abll.f);
            }
            case 8: {
                return ((afbh)o).c();
            }
            case 7: {
                return ((Optional)o).get();
            }
            case 6: {
                return ((aaoz)o).a();
            }
            case 5: {
                return ((Optional)o).get();
            }
            case 4: {
                return ((aazk)o).c;
            }
            case 3: {
                return ((aazk)o).e;
            }
            case 2: {
                return ((aazk)o).d;
            }
            case 1: {
                final yre yre = (yre)o;
                final aqdg a2 = aqdh.a();
                final afgh afgh = (afgh)DesugarArrays.stream((Object[])yre.k()).map((Function)new zzl(12)).collect(afdz.a);
                ((ahcr)a2).copyOnWrite();
                aqdh.c((aqdh)a2.instance, (Iterable)afgh);
                final FormatStreamModel e = yre.e();
                if (e != null) {
                    final Optional first = Collection$_EL.stream((Collection)afgh).filter((Predicate)new aabj(e, 2)).findFirst();
                    a2.getClass();
                    first.ifPresent((Consumer)new aaqr(a2, 3));
                }
                return ((ahcr)a2).build();
            }
            case 0: {
                return ((aapt)o).a();
            }
        }
    }
}
