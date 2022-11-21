import android.view.View;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class acyy
{
    public final Object a;
    public final Object b;
    
    public acyy(final aajm b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final aawb b, final adzx a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final abnd b, final ytl a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final abpl b, final abqv a) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final abpl b, final afbk a) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final acvt b, final hzf a, final byte[] array, final byte[] array2, final byte[] array3) {
        this.b = b;
        this.a = a;
    }
    
    public acyy(final agmq a, final Object b, final byte[] array, final byte[] array2) {
        this.a = a;
        this.b = b;
    }
    
    public acyy(final Map a, final veh b) {
        this.a = a;
        this.b = b;
    }
    
    public acyy(final zgk b, final agpw a, final byte[] array, final byte[] array2) {
        this.b = b;
        this.a = a;
    }
    
    public final View a() {
        final Object b = this.b;
        final agpw agpw = (agpw)this.a;
        if (agpw.k() == 2) {
            final zgk zgk = (zgk)b;
            if (zgk.d.getParent() != null) {
                return (View)zgk.d.getParent().getParent();
            }
        }
        if (agpw.k() == 3) {
            return (View)((zgk)b).d.getParent();
        }
        return null;
    }
}
