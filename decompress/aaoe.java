import com.google.protobuf.MessageLite;
import j$.util.Optional;
import com.google.android.libraries.blocks.runtime.RuntimeStreamWriter;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aaoe implements asjm
{
    public final Object a;
    private final int b;
    
    public aaoe(final aalm a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aaon a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aaos a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aaoz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aape a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aapf a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final aaqz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final RuntimeStreamWriter a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public aaoe(final isa a, final int b, final byte[] array) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        switch (this.b) {
            default: {
                ((aaqz)this.a).h((aanw)o);
                return;
            }
            case 19: {
                ((aaqz)this.a).g((aant)o);
                return;
            }
            case 18: {
                ((aaqz)this.a).f((aans)o);
                return;
            }
            case 17: {
                ((aapf)this.a).a((aans)o);
                return;
            }
            case 16: {
                ((aape)this.a).a((aans)o);
                return;
            }
            case 15: {
                final Object a = this.a;
                if (((aanf)o).b().a(new abka[] { abka.f })) {
                    ((aapa)((isa)a).a).e();
                }
                return;
            }
            case 14: {
                ((aaoz)this.a).a(Optional.of((Object)o));
                return;
            }
            case 13: {
                final Object a2 = this.a;
                final aama aama = (aama)o;
                ((aaoz)a2).a(Optional.empty());
                return;
            }
            case 12: {
                ((RuntimeStreamWriter)this.a).b((Throwable)o);
                return;
            }
            case 11: {
                ((RuntimeStreamWriter)this.a).b((Throwable)o);
                return;
            }
            case 10: {
                final Object a3 = this.a;
                final int a4 = ((aanw)o).a();
                final aqbz a5 = aqca.a();
                final apta e = aakv.e(a4);
                a5.copyOnWrite();
                aqca.c((aqca)a5.instance, e);
                ((RuntimeStreamWriter)a3).c((MessageLite)a5.build());
                return;
            }
            case 9: {
                final Object a6 = this.a;
                final aani aani = (aani)o;
                if (aani.a() != null) {
                    final angl i = aani.a().i;
                    if (i != null) {
                        angh angh;
                        if ((angh = i.i) == null) {
                            angh = angh.a;
                        }
                        if ((angh.b & 0x1) != 0x0) {
                            angh angh2;
                            if ((angh2 = i.i) == null) {
                                angh2 = angh.a;
                            }
                            angg angg;
                            if ((angg = angh2.c) == null) {
                                angg = angg.a;
                            }
                            angf angf;
                            if ((angg.b & 0x80) != 0x0) {
                                ange ange;
                                if ((ange = angg.h) == null) {
                                    ange = ange.a;
                                }
                                if ((angf = ange.c) == null) {
                                    angf = angf.a;
                                }
                            }
                            else {
                                angf = null;
                            }
                            final int n = -1;
                            int b;
                            if (angf == null) {
                                b = -1;
                            }
                            else {
                                b = angf.b;
                            }
                            final aaos aaos = (aaos)a6;
                            aaos.e = b;
                            int c;
                            if (angf == null) {
                                c = n;
                            }
                            else {
                                c = angf.c;
                            }
                            aaos.f = c;
                        }
                    }
                }
                return;
            }
            case 8: {
                ((aaos)this.a).c = ((aamh)o).d();
                return;
            }
            case 7: {
                final Object a7 = this.a;
                final aans aans = (aans)o;
                final abke a8 = abke.a;
                final int ordinal = aans.c().ordinal();
                if (ordinal != 0) {
                    if (ordinal == 9) {
                        final aaos aaos2 = (aaos)a7;
                        if (aaos2.a()) {
                            ((abpl)aaos2.a.a()).a(abop.d);
                        }
                    }
                    return;
                }
                ((aaos)a7).g = false;
                return;
            }
            case 6: {
                ((aaon)this.a).y((aamh)o);
                return;
            }
            case 5: {
                ((aaon)this.a).A((aani)o);
                return;
            }
            case 4: {
                final Object a9 = this.a;
                final aano aano = (aano)o;
                ((aaon)a9).E();
                return;
            }
            case 3: {
                ((aaon)this.a).x((aany)o);
                return;
            }
            case 2: {
                ((aaon)this.a).z((aany)o);
                return;
            }
            case 1: {
                ((aalm)this.a).b((aamg)o);
                return;
            }
            case 0: {
                ((aaon)this.a).d((aans)o);
            }
        }
    }
}
