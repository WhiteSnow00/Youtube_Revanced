import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adu
{
    float a;
    float b;
    float c;
    float d;
    int e;
    aeb f;
    
    public adu(final Context context, final XmlPullParser xmlPullParser) {
        this.a = Float.NaN;
        this.b = Float.NaN;
        this.c = Float.NaN;
        this.d = Float.NaN;
        this.e = -1;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aef.j);
        for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.e = obtainStyledAttributes.getResourceId(0, this.e);
                final String resourceTypeName = context.getResources().getResourceTypeName(this.e);
                context.getResources().getResourceName(this.e);
                if ("layout".equals(resourceTypeName)) {
                    (this.f = new aeb()).b(context, this.e);
                }
            }
            else if (index == 1) {
                this.d = obtainStyledAttributes.getDimension(1, this.d);
            }
            else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(2, this.b);
            }
            else if (index == 3) {
                this.c = obtainStyledAttributes.getDimension(3, this.c);
            }
            else if (index == 4) {
                this.a = obtainStyledAttributes.getDimension(4, this.a);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
