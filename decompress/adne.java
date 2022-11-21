// 
// Decompiled by Procyon v0.6.0
// 

public final class adne
{
    public final adoj a;
    public final adoj b;
    
    public adne(final adoj a, final adoj b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof adne)) {
            return false;
        }
        final adne adne = (adne)o;
        return aexq.c(this.a, adne.a) && aexq.c(this.b, adne.b);
    }
}
