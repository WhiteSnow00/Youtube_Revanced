import com.google.android.libraries.elements.interfaces.PerformanceSpanBlocklist;
import java.util.EnumSet;
import java.util.List;
import java.util.Collections;
import com.google.android.libraries.elements.interfaces.PerformanceSpan;
import com.google.android.libraries.elements.interfaces.PerformanceMonitorAdapter;

// 
// Decompiled by Procyon v0.6.0
// 

final class ovt extends PerformanceMonitorAdapter
{
    private final boolean a;
    private final ovu b;
    
    public ovt(final boolean a, final ovu b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean flushPerformanceSpan(final PerformanceSpan performanceSpan) {
        this.b.a(Collections.singletonList(performanceSpan));
        return true;
    }
    
    public final long getCurrentThread() {
        final ovy b = ovy.b;
        return ovx.a().b;
    }
    
    public final EnumSet getPerformanceSpanBlocklist() {
        return EnumSet.noneOf(PerformanceSpanBlocklist.class);
    }
    
    public final boolean isMainThread() {
        final ovy b = ovy.b;
        return ovx.a().a;
    }
    
    public final boolean shouldRecordLogs() {
        return this.a;
    }
}
