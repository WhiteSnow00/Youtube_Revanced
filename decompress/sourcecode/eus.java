import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eus extends rnj
{
    public aexq a;
    public aexq b;
    public aexq c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final qbo g;
    public final qcv h;
    public final zhb i;
    
    public eus(final zal zal, final qcv h, final zhb i, final qbo g, final Set set, final Set set2, final Set set3, final Set set4, final Set set5, final Set set6, final afcr afcr, final afcr afcr2, final byte[] array, final byte[] array2, final byte[] array3, final byte[] array4, final byte[] array5) {
        super(zal, set, set2, set3, set4, set5, set6, afcr, afcr2, (byte[])null, (byte[])null);
        this.h = h;
        this.i = i;
        this.g = g;
        final aewp a = aewp.a;
        this.a = a;
        this.b = a;
        this.c = a;
    }
    
    public final void a() {
        if (this.d(false)) {
            this.b();
            this.c();
            if (this.d) {
                if (this.a.h() && this.b.h()) {
                    this.j((sfh)this.a.c(), (sdr)this.b.c(), sdm.a);
                }
                this.d = false;
            }
        }
        if (this.a.h()) {
            this.o((sfh)this.a.c(), sdm.a);
        }
        final aewp a = aewp.a;
        this.b = a;
        this.a = a;
        this.c = a;
    }
    
    public final void b() {
        if (!this.f) {
            return;
        }
        this.f = false;
    }
    
    public final void c() {
        if (!this.e) {
            return;
        }
        this.e = false;
        this.g((sfh)this.a.c(), (sdr)this.b.c(), sdm.a, 0);
        this.l((sfh)this.a.c(), sdm.a);
    }
    
    public final boolean d(final boolean b) {
        if (!this.a.h()) {
            if (b) {
                qcv.A((sfh)null, "[LastMileDeliveryExternallyManagedSlotAdapter] shown without an activeSlot.");
            }
            return false;
        }
        if (!this.b.h()) {
            if (b) {
                qcv.A((sfh)null, "[LastMileDeliveryExternallyManagedSlotAdapter] shown without an activeSlot.");
            }
            return false;
        }
        return true;
    }
}
