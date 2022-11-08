import java.nio.ByteBuffer;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxb implements ddj
{
    public int b;
    public final int c;
    public final int d;
    public final int e;
    private int g;
    private boolean h;
    private Integer i;
    private Integer j;
    private Integer k;
    
    public oxb() {
        this.c = -1;
        this.d = -1;
        this.e = -1;
    }
    
    public static final int c(final int n) {
        int n2 = n;
        if (n == Integer.MIN_VALUE) {
            n2 = 0;
        }
        return n2;
    }
    
    public final void a(final MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(21).putInt(this.g).put((byte)0).putInt(0).putInt(-1).putInt(-1).putInt(-1).array());
    }
    
    public final void b(final int n) {
        this.b |= n;
        this.g |= n;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof oxb) {
            final oxb oxb = (oxb)o;
            if (this.g == oxb.g) {
                final boolean h = oxb.h;
                final Integer i = oxb.i;
                if (dpg.n(null, null)) {
                    final int c = oxb.c;
                    final int d = oxb.d;
                    final int e = oxb.e;
                    final Integer j = oxb.j;
                    if (dpg.n(null, null)) {
                        final Integer k = oxb.k;
                        if (dpg.n(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return dpg.f(this.g, dpg.f(0, dpg.g(null, dpg.f(-1, dpg.f(-1, dpg.f(-1, dpg.f(0, dpg.e(0))))))));
    }
    
    @Override
    public final String toString() {
        final int b = this.b;
        String s;
        if ((b & 0x10) != 0x0) {
            s = "kill_animation ";
        }
        else {
            s = "";
        }
        String s2;
        if ((b & 0x4) != 0x0) {
            s2 = "no_overlay ";
        }
        else {
            s2 = "";
        }
        String s3;
        if ((b & 0x2000) != 0x0) {
            s3 = "app_domain ";
        }
        else {
            s3 = "";
        }
        final int a = qkh.a;
        final int b2 = this.b;
        String s4;
        if (0x1 != (b2 & 0x1)) {
            s4 = "";
        }
        else {
            s4 = "crop ";
        }
        String s5;
        if ((0x400000 & b2) != 0x0) {
            s5 = "circlecrop ";
        }
        else {
            s5 = "";
        }
        String s6;
        if ((b2 & 0x8) != 0x0) {
            s6 = "smartcrop ";
        }
        else {
            s6 = "";
        }
        String s7;
        if ((0x2000000 & b2) != 0x0) {
            s7 = "centercrop ";
        }
        else {
            s7 = "";
        }
        String s8;
        if ((b2 & 0x1000) != 0x0) {
            s8 = "loose_face_crop ";
        }
        else {
            s8 = "";
        }
        String s9;
        if ((b2 & 0x200) != 0x0) {
            s9 = "exif ";
        }
        else {
            s9 = "";
        }
        String s10;
        if ((b2 & 0x800) != 0x0) {
            s10 = "jpeg ";
        }
        else {
            s10 = "";
        }
        String s11;
        if ((b2 & 0x20) != 0x0) {
            s11 = "webp ";
        }
        else {
            s11 = "";
        }
        String s12;
        if ((b2 & 0x4000) != 0x0) {
            s12 = "webp_animation ";
        }
        else {
            s12 = "";
        }
        String s13;
        if ((0x8000 & b2) != 0x0) {
            s13 = "blur ";
        }
        else {
            s13 = "";
        }
        String s14;
        if ((b2 & 0x20000) != 0x0) {
            s14 = "mp4 ";
        }
        else {
            s14 = "";
        }
        String s15;
        if ((b2 & 0x10000) != 0x0) {
            s15 = "loop ";
        }
        else {
            s15 = "";
        }
        String s16;
        if ((b2 & 0x40000) != 0x0) {
            s16 = "no_silhouette ";
        }
        else {
            s16 = "";
        }
        String s17;
        if ((b2 & 0x80000) != 0x0) {
            s17 = "monogram ";
        }
        else {
            s17 = "";
        }
        String s18;
        if ((b2 & 0x40) != 0x0) {
            s18 = "no_upscale ";
        }
        else {
            s18 = "";
        }
        String s19;
        if ((b2 & 0x800000) != 0x0) {
            s19 = "no_google_metadata ";
        }
        else {
            s19 = "";
        }
        String s20;
        if ((b2 & 0x1000000) != 0x0) {
            s20 = "google_metadata ";
        }
        else {
            s20 = "";
        }
        String s21;
        if ((b2 & 0x4000000) != 0x0) {
            s21 = "force_transformation ";
        }
        else {
            s21 = "";
        }
        String s22;
        if ((b2 & 0x8000000) != 0x0) {
            s22 = "colorize_filter ";
        }
        else {
            s22 = "";
        }
        String s23;
        if ((b2 & 0x100) != 0x0) {
            s23 = "soften-1,null,null ";
        }
        else {
            s23 = "";
        }
        final StringBuilder sb = new StringBuilder("FifeUrlOptions{ ");
        sb.append(s);
        sb.append(s2);
        sb.append(s3);
        sb.append(s4);
        sb.append(s5);
        sb.append(s6);
        sb.append(s7);
        sb.append(s8);
        sb.append(s9);
        sb.append(s10);
        sb.append("");
        sb.append(s11);
        sb.append(s12);
        sb.append(s13);
        sb.append(s14);
        sb.append(s15);
        sb.append(s16);
        sb.append(s17);
        sb.append(s18);
        sb.append(s19);
        sb.append(s20);
        sb.append(s21);
        sb.append("");
        sb.append(s22);
        sb.append(s23);
        sb.append(" }");
        return sb.toString();
    }
}
