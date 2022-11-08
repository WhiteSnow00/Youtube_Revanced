import com.google.android.libraries.elements.interfaces.JsPerformanceEventInfo;
import com.google.android.libraries.elements.interfaces.PerformanceEventInfo;
import java.util.Iterator;
import io.grpc.Status;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executors;
import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;
import java.util.concurrent.ScheduledExecutorService;
import com.google.android.libraries.elements.interfaces.PerformanceLogger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ovu
{
    public final PerformanceLogger a;
    private final owg b;
    private final String c;
    private volatile ScheduledExecutorService d;
    
    public ovu(final boolean b, final owg b2, final boolean b3) {
        (this.b = b2).c(this.c = b2.b());
        final ovt ovt = new ovt(b, this);
        ogh.a();
        this.a = PerformanceLogger.create((PerformanceMonitorAdapter)ovt, b3);
        if (b) {
            this.d = Executors.newSingleThreadScheduledExecutor();
            if (!b3) {
                this.d.scheduleAtFixedRate(new ovk(this, 4), 30L, 30L, TimeUnit.SECONDS);
            }
        }
    }
    
    public final void a(final List list) {
        for (final PerformanceSpan performanceSpan : list) {
            final owa a = owb.a();
            a.h = new adgk(performanceSpan.getIsMainThread(), performanceSpan.getBeginThreadIdentifier());
            if (performanceSpan.getInfo() != null) {
                final PerformanceEventInfo info = performanceSpan.getInfo();
                if (info.getNodeIdentifier() != null) {
                    a.a = info.getNodeIdentifier();
                }
                if (info.getMaterializationCount() != null) {
                    a.b(info.getMaterializationCount());
                }
                if (info.getCommandExtensionId() != null) {
                    a.b = info.getCommandExtensionId().intValue();
                }
                if (info.getTemplateUri() != null) {
                    a.c(afdu.s((Object)info.getTemplateUri()));
                }
                else {
                    a.c((afdu)afgq.a);
                }
                final JsPerformanceEventInfo jsPerformanceEventInfo = info.getJsPerformanceEventInfo();
                if (jsPerformanceEventInfo != null) {
                    a.c = Status.fromCodeValue(jsPerformanceEventInfo.getStatusCode()).withDescription(jsPerformanceEventInfo.getStatusMessage());
                    a.d = jsPerformanceEventInfo.getModuleIdentifier();
                    a.e = jsPerformanceEventInfo.getFunctionName();
                    a.g = jsPerformanceEventInfo.getIsSynchronous();
                    final Integer bindingExtensionId = jsPerformanceEventInfo.getBindingExtensionId();
                    if (bindingExtensionId != null) {
                        a.f = bindingExtensionId;
                    }
                }
            }
            final Long begin = performanceSpan.getBegin();
            Long value = null;
            if (begin != null) {
                value = value;
                if (performanceSpan.getEnd() != null) {
                    value = performanceSpan.getEnd() - performanceSpan.getBegin();
                }
            }
            final ovz a2 = owd.a();
            a2.b(PerformanceLogger.nameForPerformanceSpanType(performanceSpan.getType()));
            a2.d = performanceSpan.getParentNonce();
            a2.a = performanceSpan.getBegin();
            a2.b = performanceSpan.getEnd();
            a2.c = value;
            a2.e = a.a();
            this.b.g(this.c, a2.a());
        }
    }
}
