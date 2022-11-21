import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqjf extends ahcz implements aheo
{
    public static final aqjf a;
    public static final ahcx b;
    private static volatile ahev k;
    public int c;
    public aqjc d;
    public CommandOuterClass$Command e;
    public CommandOuterClass$Command f;
    public aqjc g;
    public boolean h;
    public int i;
    public int j;
    private byte l;
    
    static {
        final aqjf a2 = new aqjf();
        ahcz.registerDefaultInstance(aqjf.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)aqkf.a, a2, (MessageLite)a2, null, 277808098, ahgc.k, aqjf.class);
    }
    
    private aqjf() {
        this.l = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev k;
                if ((k = aqjf.k) == null) {
                    synchronized (aqjf.class) {
                        if (aqjf.k == null) {
                            aqjf.k = (ahev)new ahcs((ahcz)aqjf.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aqjf.a;
            }
            case 4: {
                return new ahcr((ahcz)aqjf.a);
            }
            case 3: {
                return new aqjf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqjf.a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1409\u0002\u0004\u1409\u0003\u0005\u1007\u0004\u0006\u100c\u0005\u0007\u100c\u0006", new Object[] { "c", "d", "e", "f", "g", "h", "i", aqdx.u, "j", aqdx.t });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
