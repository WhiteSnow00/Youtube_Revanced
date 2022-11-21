import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

final class agbu extends agci
{
    public agbu(final Class clazz) {
        super(clazz);
    }
    
    public final Object a(final MessageLite messageLite) {
        final agfa agfa = (agfa)messageLite;
        if (!agfa.d.H()) {
            agey agey;
            if ((agey = agfa.c) == null) {
                agey = agey.a;
            }
            return new agbp(agfa, aewr.x(agey), aewr.K(agey), aewr.w(agey), null, null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
