// 
// Decompiled by Procyon v0.6.0
// 

public final class aalt
{
    public final Object a;
    final Object b;
    
    public aalt(final aalv b, final yqb a) {
        this.b = b;
        this.a = a;
    }
    
    public aalt(final aari b, final aarh a) {
        this.b = b;
        this.a = a;
    }
    
    public final yph a() {
        return yph.c(aalv.a((aalv)this.b), (yqb)this.a);
    }
    
    public final float b() {
        final float b = ((aari)this.b).b;
        if (b == 0.0f) {
            return -1.0f;
        }
        return (((aarh)this.a).a[0] + b / 2.0f) / b;
    }
    
    public final boolean c() {
        final aari aari = (aari)this.b;
        if (aari.b != 0.0f) {
            if (aari.c != 0.0f) {
                if (Math.abs(((aarh)this.a).a[0]) <= ((aari)this.b).b / 2.0f && Math.abs(((aarh)this.a).a[1]) <= ((aari)this.b).c / 2.0f) {
                    return true;
                }
            }
        }
        return false;
    }
}
