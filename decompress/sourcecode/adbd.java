import java.util.Map;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareExternallyEndpoint;
import java.util.HashMap;
import java.util.concurrent.Callable;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.TextView;
import android.widget.ImageView;
import android.view.View;
import android.view.View$OnClickListener;

// 
// Decompiled by Procyon v0.6.0
// 

public final class adbd implements View$OnClickListener, acil
{
    private final adbc a;
    private final View b;
    private final ImageView c;
    private final TextView d;
    private final acex e;
    private final float f;
    private final float g;
    private aoak h;
    
    public adbd(final Context context, final adbc a, final aceo aceo) {
        this.a = a;
        final View inflate = View.inflate(context, 2131625372, (ViewGroup)null);
        this.b = inflate;
        final ImageView c = (ImageView)inflate.findViewById(2131429270);
        this.c = c;
        this.d = (TextView)inflate.findViewById(2131432092);
        this.e = new acex((tni)aceo, c);
        this.f = inflate.getAlpha();
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.g = typedValue.getFloat();
        inflate.setOnClickListener((View$OnClickListener)this);
    }
    
    public final View a() {
        return this.b;
    }
    
    public final void b(final aoak aoak, final CharSequence text, final Drawable imageDrawable) {
        if (!aeda.v(this.h, aoak)) {
            return;
        }
        this.d.setText(text);
        this.c.setImageDrawable(imageDrawable);
        if (((acyz)this.a).j) {
            this.b.animate().alpha(this.f).start();
            return;
        }
        this.b.setAlpha(this.g);
    }
    
    public final void c(final acir acir) {
        this.h = null;
        this.c.setImageDrawable((Drawable)null);
        this.e.a();
        this.d.setText((CharSequence)null);
    }
    
    public final void onClick(final View view) {
        final adbc a = this.a;
        final acyz acyz = (acyz)a;
        if (acyz.j) {
            final aoak aoak = (aoak)view.getTag();
            acyz.d.d((Object)new aczd());
            final HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
            hashMap.put("endpoint_resolver_override", acyz.b);
            hashMap.put("interaction_logger_override", acyz.e);
            hashMap.put("click_tracking_params", aoak.h.I());
            final alff k = acyz.k(aoak);
            if (k != null) {
                hashMap.put("client_data_override", k);
            }
            final vax b = acyz.b;
            final String i = acyz.k;
            aioe aioe;
            if ((aioe = aoak.g) == null) {
                aioe = aioe.a;
            }
            final agzc agzc = (agzc)((agzi)aioe).toBuilder();
            if (agzc.rs((agyr)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)) {
                final agza builder = ((agzi)agzc.rr((agyr)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint)).toBuilder();
                final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint.b & 0x1) != 0x0) {
                    akhj akhj;
                    if ((akhj = sendShareEndpoint$SendShareExternallyEndpoint.c) == null) {
                        akhj = akhj.a;
                    }
                    final agza builder2 = ((agzi)akhj).toBuilder();
                    final String j = tsx.i(i);
                    builder2.copyOnWrite();
                    final akhj akhj2 = (akhj)builder2.instance;
                    akhj2.b |= 0x4;
                    akhj2.c = j;
                    builder.copyOnWrite();
                    final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint2 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                    final akhj c = (akhj)builder2.build();
                    c.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint2.c = c;
                    sendShareEndpoint$SendShareExternallyEndpoint2.b |= 0x1;
                }
                final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint3 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                if ((sendShareEndpoint$SendShareExternallyEndpoint3.b & 0x2) != 0x0) {
                    akhh akhh;
                    if ((akhh = sendShareEndpoint$SendShareExternallyEndpoint3.d) == null) {
                        akhh = akhh.a;
                    }
                    final agza builder3 = ((agzi)akhh).toBuilder();
                    builder3.copyOnWrite();
                    final akhh akhh2 = (akhh)builder3.instance;
                    akhh2.b |= 0x2;
                    akhh2.d = false;
                    builder.copyOnWrite();
                    final SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint4 = (SendShareEndpoint$SendShareExternallyEndpoint)builder.instance;
                    final akhh d = (akhh)builder3.build();
                    d.getClass();
                    sendShareEndpoint$SendShareExternallyEndpoint4.d = d;
                    sendShareEndpoint$SendShareExternallyEndpoint4.b |= 0x2;
                }
                agzc.e((agyr)SendShareEndpoint$SendShareExternallyEndpoint.sendShareExternallyEndpoint, (Object)builder.build());
            }
            b.c((aioe)((agza)agzc).build(), (Map)hashMap);
            acyz.c.b(true);
        }
    }
}
