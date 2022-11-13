import android.view.ViewGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jfv implements acks
{
    private final int a;
    private final Object b;
    
    public jfv(final Context b, final int a) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final Context b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final Context b, final int a, final char[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final Context b, final int a, final int[] array) {
        this.a = a;
        this.b = b;
    }
    
    public jfv(final Context b, final int a, final short[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final atke b, final int a) {
        this.a = a;
        this.b = b;
    }
    
    public jfv(final atke b, final int a, final byte[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final atke b, final int a, final char[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public jfv(final atke b, final int a, final short[] array) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public final acko a(final ViewGroup viewGroup) {
        switch (this.a) {
            default: {
                return (acko)new fuw((Context)this.b, 12, (short[])null);
            }
            case 8: {
                final Context context = (Context)((atke)this.b).a();
                viewGroup.getClass();
                return (acko)new adad(context);
            }
            case 7: {
                return (acko)new fuw((Context)this.b, 10, (char[])null);
            }
            case 6: {
                return (acko)new ken((Context)this.b, 3);
            }
            case 5: {
                return (acko)new fuw((Context)this.b, 9, (byte[])null);
            }
            case 4: {
                return (acko)new fuw((fuf)((atke)this.b).a(), 4, null);
            }
            case 3: {
                return (acko)new kfr((Context)this.b, 0);
            }
            case 2: {
                final Context context2 = (Context)((atke)this.b).a();
                context2.getClass();
                return (acko)new fuw(context2, viewGroup, 3);
            }
            case 1: {
                return (acko)((atke)this.b).a();
            }
            case 0: {
                return (acko)((atke)this.b).a();
            }
        }
    }
}
