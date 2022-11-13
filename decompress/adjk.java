import j$.util.function.Consumer$_CC;
import java.util.function.Consumer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adjk implements Consumer
{
    public final Object a;
    private final int b;
    
    public adjk(final adrn a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adjk(final aekp a, final int b, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public adjk(final ahaz a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public adjk(final aphc a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void accept(final Object o) {
        final int b = this.b;
        if (b == 0) {
            final Object a = this.a;
            final boolean booleanValue = (boolean)o;
            final ahaz ahaz = (ahaz)a;
            ahaz.copyOnWrite();
            final admv admv = (admv)ahaz.instance;
            final admv a2 = admv.a;
            admv.b |= 0x10000;
            admv.s = booleanValue;
            return;
        }
        if (b == 1) {
            final Object a3 = this.a;
            final long longValue = (long)o;
            final ahaz ahaz2 = (ahaz)a3;
            ahaz2.copyOnWrite();
            final admv admv2 = (admv)ahaz2.instance;
            final admv a4 = admv.a;
            admv2.b |= 0x8000;
            admv2.r = longValue;
            return;
        }
        if (b == 2) {
            final Object a5 = this.a;
            final String s = (String)o;
            ((ahaz)a5).copyOnWrite();
            aphd.h((aphd)((aphc)a5).instance, s);
            return;
        }
        if (b != 3) {
            fkh.c((adrn)this.a, o);
            return;
        }
        adrm.a((aekp)this.a, o);
    }
    
    @Override
    public final Consumer andThen(final Consumer consumer) {
        final int b = this.b;
        if (b == 0) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b == 1) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b == 2) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        if (b != 3) {
            return Consumer$_CC.$default$andThen((Consumer)this, consumer);
        }
        return Consumer$_CC.$default$andThen((Consumer)this, consumer);
    }
}
