import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amar extends vgs
{
    private final ahcr a;
    
    private amar() {
        final amav a = amav.a;
        throw null;
    }
    
    public amar(final ahcr a) {
        this.a = a;
    }
    
    public final /* bridge */ vgv a(final vgx vgx) {
        return (vgv)this.b(vgx);
    }
    
    public final amat b(final vgx vgx) {
        return new amat((amav)this.a.build(), vgx);
    }
    
    public final void c(final amau... array) {
        for (int i = 0; i <= 0; ++i) {
            this.a.bl(array[i]);
        }
    }
    
    public final void d(final amau... array) {
        final LinkedHashSet set = new LinkedHashSet((Collection<? extends E>)Arrays.asList(array));
        final List<Object> unmodifiableList = (List<Object>)Collections.unmodifiableList((List<? extends amau>)((amav)this.a.instance).e);
        final ahcr a = this.a;
        a.copyOnWrite();
        ((amav)a.instance).e = ahcz.emptyProtobufList();
        for (final amau amau : unmodifiableList) {
            if (!set.contains(amau)) {
                this.a.bl(amau);
            }
        }
    }
}
