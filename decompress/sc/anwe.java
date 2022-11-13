import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anwe extends vfk
{
    private final ahaz a;
    
    private anwe() {
        final anwh a = anwh.a;
        throw null;
    }
    
    public anwe(final ahaz a) {
        this.a = a;
    }
    
    public final /* bridge */ vfn a(final vfp vfp) {
        return (vfn)this.e();
    }
    
    public final void b(final String... array) {
        for (int i = 0; i <= 0; ++i) {
            this.a.by(array[i]);
        }
    }
    
    public final void c() {
        final ahaz a = this.a;
        a.copyOnWrite();
        final anwh anwh = (anwh)a.instance;
        final anwh a2 = anwh.a;
        anwh.d = ahbh.emptyProtobufList();
    }
    
    public final void d(final String... array) {
        final LinkedHashSet set = new LinkedHashSet((Collection<? extends E>)Arrays.asList(array));
        final List<Object> unmodifiableList = (List<Object>)Collections.unmodifiableList((List<? extends String>)((anwh)this.a.instance).d);
        final ahaz a = this.a;
        a.copyOnWrite();
        ((anwh)a.instance).d = ahbh.emptyProtobufList();
        for (final String s : unmodifiableList) {
            if (!set.contains(s)) {
                this.a.by(s);
            }
        }
    }
    
    public final anwg e() {
        return new anwg((anwh)this.a.build());
    }
}
