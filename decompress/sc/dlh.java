import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.nio.ByteBuffer;
import java.util.List;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dlh implements ddr
{
    private static final cyb d;
    private final Context a;
    private final List b;
    private final dml c;
    private final cyb e;
    
    static {
        d = new cyb((byte[])null);
    }
    
    public dlh(final Context context, final List b, final dgg dgg, final dge dge) {
        final cyb d = dlh.d;
        this.a = context.getApplicationContext();
        this.b = b;
        this.c = new dml(dgg, dge);
        this.e = d;
    }
    
    @Override
    public final /* bridge */ dfy a(Object d, final int n, final int n2, final ddp ddp) {
        final ByteBuffer byteBuffer = (ByteBuffer)d;
        final dzo d2 = this.e.d(byteBuffer);
        try {
            dpc.b();
            try {
                if (d2.c != null) {
                    final boolean m = d2.m();
                    final dfy dfy = null;
                    final int n3 = 0;
                    if (m) {
                        d = d2.d;
                    }
                    else {
                        d = new StringBuilder();
                        for (int i = 0; i < 6; ++i) {
                            ((StringBuilder)d).append((char)d2.i());
                        }
                        if (!((StringBuilder)d).toString().startsWith("GIF")) {
                            ((dcw)d2.d).b = 1;
                        }
                        else {
                            d = d2.d;
                            ((dcw)d).f = d2.j();
                            d = d2.d;
                            ((dcw)d).g = d2.j();
                            final int j = d2.i();
                            d = d2.d;
                            ((dcw)d).h = ((j & 0x80) != 0x0);
                            ((dcw)d).i = (int)Math.pow(2.0, (j & 0x7) + 1);
                            d = d2.d;
                            ((dcw)d).j = d2.i();
                            d = d2.d;
                            ((dcw)d).k = d2.i();
                            if (((dcw)d2.d).h && !d2.m()) {
                                d = d2.d;
                                ((dcw)d).a = d2.n(((dcw)d).i);
                                d = d2.d;
                                ((dcw)d).l = ((dcw)d).a[((dcw)d).j];
                            }
                        }
                        if (!d2.m()) {
                            while (!d2.m()) {
                                final int c = ((dcw)d2.d).c;
                                final int k = d2.i();
                                if (k != 33) {
                                    if (k != 44) {
                                        if (k == 59) {
                                            break;
                                        }
                                        ((dcw)d2.d).b = 1;
                                    }
                                    else {
                                        d = d2.d;
                                        if (((dcw)d).d == null) {
                                            ((dcw)d).d = new dcv();
                                        }
                                        ((dcw)d).d.a = d2.j();
                                        ((dcw)d2.d).d.b = d2.j();
                                        ((dcw)d2.d).d.c = d2.j();
                                        ((dcw)d2.d).d.d = d2.j();
                                        final int l = d2.i();
                                        final int n4 = (int)Math.pow(2.0, (l & 0x7) + 1);
                                        final dcv d3 = ((dcw)d2.d).d;
                                        d3.e = ((l & 0x40) != 0x0);
                                        if ((l & 0x80) != 0x0) {
                                            d3.k = d2.n(n4);
                                        }
                                        else {
                                            d3.k = null;
                                        }
                                        ((dcw)d2.d).d.j = ((ByteBuffer)d2.c).position();
                                        d2.i();
                                        d2.l();
                                        if (d2.m()) {
                                            continue;
                                        }
                                        d = d2.d;
                                        ++((dcw)d).c;
                                        ((dcw)d).e.add(((dcw)d).d);
                                    }
                                }
                                else {
                                    final int i2 = d2.i();
                                    if (i2 != 1) {
                                        if (i2 != 249) {
                                            if (i2 != 254) {
                                                if (i2 != 255) {
                                                    d2.l();
                                                }
                                                else {
                                                    d2.k();
                                                    d = new StringBuilder();
                                                    for (int n5 = 0; n5 < 11; ++n5) {
                                                        ((StringBuilder)d).append((char)((byte[])d2.b)[n5]);
                                                    }
                                                    if (((StringBuilder)d).toString().equals("NETSCAPE2.0")) {
                                                        do {
                                                            d2.k();
                                                            d = d2.b;
                                                            if (((byte[])d)[0] == 1) {
                                                                ((dcw)d2.d).m = ((((byte[])d)[2] & 0xFF) << 8 | (((byte[])d)[1] & 0xFF));
                                                            }
                                                            if (d2.a > 0) {
                                                                continue;
                                                            }
                                                            break;
                                                        } while (!d2.m());
                                                    }
                                                    else {
                                                        d2.l();
                                                    }
                                                }
                                            }
                                            else {
                                                d2.l();
                                            }
                                        }
                                        else {
                                            final Object d4 = d2.d;
                                            d = new dcv();
                                            ((dcw)d4).d = (dcv)d;
                                            d2.i();
                                            final int i3 = d2.i();
                                            final dcv d5 = ((dcw)d2.d).d;
                                            if ((d5.g = (i3 & 0x1C) >> 2) == 0) {
                                                d5.g = 1;
                                            }
                                            d5.f = (0x1 == (i3 & 0x1));
                                            int j2;
                                            if ((j2 = d2.j()) < 2) {
                                                j2 = 10;
                                            }
                                            final dcv d6 = ((dcw)d2.d).d;
                                            d6.i = j2 * 10;
                                            d6.h = d2.i();
                                            d2.i();
                                        }
                                    }
                                    else {
                                        d2.l();
                                    }
                                }
                            }
                            d = d2.d;
                            if (((dcw)d).c < 0) {
                                ((dcw)d).b = 1;
                            }
                        }
                        d = d2.d;
                    }
                    dfy dfy2 = dfy;
                    if (((dcw)d).c > 0) {
                        if (((dcw)d).b != 0) {
                            dfy2 = dfy;
                        }
                        else {
                            Bitmap$Config i4;
                            if (ddp.b(dlq.a) == ddb.b) {
                                i4 = Bitmap$Config.RGB_565;
                            }
                            else {
                                i4 = Bitmap$Config.ARGB_8888;
                            }
                            final int min = Math.min(((dcw)d).g / n2, ((dcw)d).f / n);
                            int highestOneBit;
                            if (min == 0) {
                                highestOneBit = n3;
                            }
                            else {
                                highestOneBit = Integer.highestOneBit(min);
                            }
                            final dcx dcx = new dcx(this.c, (dcw)d, byteBuffer, Math.max(1, highestOneBit), (byte[])null);
                            if (i4 != Bitmap$Config.ARGB_8888 && i4 != Bitmap$Config.RGB_565) {
                                d = new(java.lang.IllegalArgumentException.class)();
                                final String value = String.valueOf(i4);
                                final String value2 = String.valueOf(Bitmap$Config.ARGB_8888);
                                final String value3 = String.valueOf(Bitmap$Config.RGB_565);
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Unsupported format: ");
                                sb.append(value);
                                sb.append(", must be one of ");
                                sb.append(value2);
                                sb.append(" or ");
                                sb.append(value3);
                                new IllegalArgumentException(sb.toString());
                                throw d;
                            }
                            dcx.i = i4;
                            ((dcu)dcx).b();
                            final Bitmap a = ((dcu)dcx).a();
                            if (a == null) {
                                dfy2 = dfy;
                            }
                            else {
                                dfy2 = new dll(new dlj(new dli(new dlp(dbp.b(this.a), (dcu)dcx, n, n2, djf.b, a))));
                            }
                        }
                    }
                    this.e.e(d2);
                    return dfy2;
                }
                d = new IllegalStateException("You must call setData() before parseHeader()");
                throw d;
            }
            finally {}
        }
        finally {
            this.e.e(d2);
            while (true) {}
        }
    }
    
    @Override
    public final /* bridge */ boolean b(final Object o, final ddp ddp) {
        final ByteBuffer byteBuffer = (ByteBuffer)o;
        return !(boolean)ddp.b(dlq.b) && cka.j(this.b, byteBuffer) == ImageHeaderParser$ImageType.GIF;
    }
}
