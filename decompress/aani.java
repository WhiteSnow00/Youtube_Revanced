import com.google.protobuf.MessageLite;
import j$.util.Optional;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aani implements asmi
{
    public final Object a;
    private final int b;
    
    public aani(final aanj a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aani(final aaqi a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aani(final aaqn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aani(final aaqw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aani(final RuntimeStreamWriter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((aaqw)this.a).a(Optional.of((Object)o));
                return;
            }
            case 19: {
                final Object a = this.a;
                final aanx aanx = (aanx)o;
                ((aaqw)a).a(Optional.empty());
                return;
            }
            case 18: {
                ((RuntimeStreamWriter)this.a).b((Throwable)o);
                return;
            }
            case 17: {
                ((RuntimeStreamWriter)this.a).c((MessageLite)o);
                return;
            }
            case 16: {
                ((RuntimeStreamWriter)this.a).b((Throwable)o);
                return;
            }
            case 15: {
                final Object a2 = this.a;
                final int a3 = ((aapt)o).a();
                final aqeu a4 = aqev.a();
                final apvn e = aamr.e(a3);
                ((ahcr)a4).copyOnWrite();
                aqev.c((aqev)a4.instance, e);
                ((RuntimeStreamWriter)a2).c((MessageLite)((ahcr)a4).build());
                return;
            }
            case 14: {
                ((RuntimeStreamWriter)this.a).c((MessageLite)o);
                return;
            }
            case 13: {
                final Object a5 = this.a;
                final aapf aapf = (aapf)o;
                if (aapf.a() != null) {
                    final anis i = aapf.a().i;
                    if (i != null) {
                        anio anio;
                        if ((anio = i.i) == null) {
                            anio = anio.a;
                        }
                        if ((anio.b & 0x1) != 0x0) {
                            anio anio2;
                            if ((anio2 = i.i) == null) {
                                anio2 = anio.a;
                            }
                            anin anin;
                            if ((anin = anio2.c) == null) {
                                anin = anin.a;
                            }
                            anim anim;
                            if ((anin.b & 0x80) != 0x0) {
                                anil anil;
                                if ((anil = anin.h) == null) {
                                    anil = anil.a;
                                }
                                if ((anim = anil.c) == null) {
                                    anim = anim.a;
                                }
                            }
                            else {
                                anim = null;
                            }
                            final int n = -1;
                            int b;
                            if (anim == null) {
                                b = -1;
                            }
                            else {
                                b = anim.b;
                            }
                            final aaqn aaqn = (aaqn)a5;
                            aaqn.e = b;
                            int c;
                            if (anim == null) {
                                c = n;
                            }
                            else {
                                c = anim.c;
                            }
                            aaqn.f = c;
                        }
                    }
                }
                return;
            }
            case 12: {
                ((aaqn)this.a).c = ((aaoe)o).d();
                return;
            }
            case 11: {
                final Object a6 = this.a;
                final aapp aapp = (aapp)o;
                final abll a7 = abll.a;
                final int ordinal = aapp.c().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 9) {
                        final aaqn aaqn2 = (aaqn)a6;
                        if (aaqn2.a()) {
                            ((abqq)aaqn2.a.a()).a(abpx.d);
                        }
                    }
                    return;
                }
                ((aaqn)a6).g = false;
                return;
            }
            case 10: {
                ((aaqi)this.a).y((aaoe)o);
                return;
            }
            case 9: {
                ((aaqi)this.a).A((aapf)o);
                return;
            }
            case 8: {
                final Object a8 = this.a;
                final aapl aapl = (aapl)o;
                ((aaqi)a8).E();
                return;
            }
            case 7: {
                ((aaqi)this.a).x((aapv)o);
                return;
            }
            case 6: {
                ((aaqi)this.a).z((aapv)o);
                return;
            }
            case 5: {
                ((aaqi)this.a).d((aapp)o);
                return;
            }
            case 4: {
                ((aanj)this.a).b((aaod)o);
                return;
            }
            case 3: {
                ((aanj)this.a).b((aaod)o);
                return;
            }
            case 2: {
                ((aanj)this.a).e((aaof)o);
                return;
            }
            case 1: {
                final Object a9 = this.a;
                final aanz aanz = (aanz)o;
                ((aanj)a9).c();
                return;
            }
            case 0: {
                final Object a10 = this.a;
                final aaoc aaoc = (aaoc)o;
                ((aanj)a10).c();
            }
        }
    }
}
