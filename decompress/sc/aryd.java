import android.os.Parcel;
import io.grpc.Status;

// 
// Decompiled by Procyon v0.6.0
// 

final class aryd extends aryg
{
    public final boolean a;
    private Status h;
    private arwk i;
    
    public aryd(final arxz arxz, final artu artu, final int n, final boolean a) {
        super(arxz, artu, n);
        this.a = a;
    }
    
    protected final void a(final Status status) {
        ((asae)this.g).a(status, asad.a, new arwk());
    }
    
    protected final void b() {
        this.f.d();
        this.f.l();
        this.l(arye.f);
        ((asae)this.g).a(this.h, asad.a, this.i);
        this.n();
    }
    
    public final void c(final int n, final Parcel parcel) {
        this.h = aryu.a(n, parcel);
        this.i = arva.d(parcel, this.c);
    }
    
    public final boolean d() {
        return this.a;
    }
    
    public final void e(final Parcel parcel) {
        final arwk d = arva.d(parcel, this.c);
        this.f.a();
        ((asae)this.g).c(d);
    }
}
