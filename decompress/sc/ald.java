import android.view.ContentInfo;
import android.os.Bundle;
import android.net.Uri;
import android.content.ClipData;

// 
// Decompiled by Procyon v0.6.0
// 

final class ald implements alc
{
    private final ClipData a;
    private final int b;
    private final int c;
    private final Uri d;
    private final Bundle e;
    
    public ald(final ala ala) {
        final ClipData a = ala.a;
        afg.k(a);
        this.a = a;
        final int b = ala.b;
        afg.h(b, 0, 5, "source");
        this.b = b;
        this.c = ala.c;
        this.d = ala.d;
        this.e = ala.e;
    }
    
    public final int a() {
        return this.c;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final ClipData c() {
        return this.a;
    }
    
    public final ContentInfo d() {
        return null;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        final int b = this.b;
        String s;
        if (b != 1) {
            if (b != 2) {
                s = "SOURCE_DRAG_AND_DROP";
            }
            else {
                s = "SOURCE_INPUT_METHOD";
            }
        }
        else {
            s = "SOURCE_CLIPBOARD";
        }
        sb.append(s);
        sb.append(", flags=");
        String s2;
        if (1 != this.c) {
            s2 = "0";
        }
        else {
            s2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        sb.append(s2);
        final Uri d = this.d;
        final String s3 = "";
        String string;
        if (d == null) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder(", hasLinkUri(");
            sb2.append(this.d.toString().length());
            sb2.append(")");
            string = sb2.toString();
        }
        sb.append(string);
        String s4;
        if (this.e == null) {
            s4 = s3;
        }
        else {
            s4 = ", hasExtras";
        }
        sb.append(s4);
        sb.append("}");
        return sb.toString();
    }
}
