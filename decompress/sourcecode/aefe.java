import android.os.Parcelable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.IBinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aefe extends eny implements aefg
{
    public aefe(final IBinder binder) {
        super(binder, "com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }
    
    public final String a(String string) {
        final Parcel qq = this.qQ();
        qq.writeString(string);
        final Parcel qr = this.qR(8, qq);
        string = qr.readString();
        qr.recycle();
        return string;
    }
    
    public final void b(final Bundle bundle) {
        final Parcel qq = this.qQ();
        eoa.h(qq, (Parcelable)bundle);
        this.qS(2, qq);
    }
    
    public final void g() {
        this.qS(3, this.qQ());
    }
    
    public final void h(final int n, final int n2) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        qq.writeInt(n2);
        this.qS(9, qq);
    }
    
    public final void i(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(10, qq);
    }
    
    public final void j(final int n) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        this.qS(6, qq);
    }
    
    public final void k(final boolean b) {
        final Parcel qq = this.qQ();
        eoa.f(qq, b);
        this.qS(7, qq);
    }
    
    public final void l(final int n, final String s, final long n2) {
        final Parcel qq = this.qQ();
        qq.writeInt(n);
        qq.writeString(s);
        qq.writeLong(n2);
        this.qS(4, qq);
    }
    
    public final void m(final long n) {
        final Parcel qq = this.qQ();
        qq.writeLong(n);
        this.qS(5, qq);
    }
}
