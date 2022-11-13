import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayDeque;
import java.util.Deque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bqa implements bxj
{
    public final Deque a;
    private final bxl b;
    private int c;
    private boolean d;
    
    public bqa() {
        this.b = new bxl();
        this.a = new ArrayDeque();
        for (int i = 0; i < 2; ++i) {
            this.a.addFirst(new bpy(this));
        }
        this.c = 0;
    }
    
    public final /* bridge */ Object a() {
        dk.h(this.d ^ true);
        if (this.c != 0) {
            return null;
        }
        this.c = 1;
        return this.b;
    }
    
    public final /* bridge */ Object b() {
        dk.h(this.d ^ true);
        final int c = this.c;
        bxm bxm2;
        final bxm bxm = bxm2 = null;
        if (c == 2) {
            if (this.a.isEmpty()) {
                bxm2 = bxm;
            }
            else {
                bxm2 = this.a.removeFirst();
                final bxl b = this.b;
                if (((bcw)b).isEndOfStream()) {
                    ((bcw)bxm2).addFlag(4);
                }
                else {
                    final long e = b.e;
                    final ByteBuffer c2 = b.c;
                    dk.d((Object)c2);
                    final byte[] array = c2.array();
                    final Parcel obtain = Parcel.obtain();
                    obtain.unmarshall(array, 0, array.length);
                    obtain.setDataPosition(0);
                    final Bundle bundle = obtain.readBundle(Bundle.class.getClassLoader());
                    obtain.recycle();
                    final ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                    dk.d((Object)parcelableArrayList);
                    bxm2.e(this.b.e, (bxi)new bpz(e, bac.a(azy.b, (List)parcelableArrayList)), 0L);
                }
                ((bcw)this.b).clear();
                this.c = 0;
            }
        }
        return bxm2;
    }
    
    public final String c() {
        throw null;
    }
    
    public final void d() {
        dk.h(this.d ^ true);
        ((bcw)this.b).clear();
        this.c = 0;
    }
    
    public final /* bridge */ void e(final Object o) {
        final bxl bxl = (bxl)o;
        final boolean d = this.d;
        final boolean b = true;
        dk.h(d ^ true);
        dk.h(this.c == 1);
        dk.f(this.b == bxl && b);
        this.c = 2;
    }
    
    public final void f() {
        this.d = true;
    }
    
    @Override
    public final void t(final long n) {
    }
}
