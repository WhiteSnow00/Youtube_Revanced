import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqqo extends ahcz implements aheo
{
    public static final aqqo a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public aqiq d;
    public int e;
    public double f;
    public int g;
    public boolean h;
    public int i;
    private byte k;
    
    static {
        final aqqo a2 = new aqqo();
        ahcz.registerDefaultInstance(aqqo.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 220544256, ahgc.k, aqqo.class);
    }
    
    private aqqo() {
        this.k = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte k = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqqo.j) == null) {
                    synchronized (aqqo.class) {
                        if (aqqo.j == null) {
                            aqqo.j = (ahev)new ahcs((ahcz)aqqo.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqqo.a;
            }
            case 4: {
                return new ahcr((ahcz)aqqo.a);
            }
            case 3: {
                return new aqqo();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqqo.a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100c\u0001\u0004\u1000\u0003\u0006\u100c\u0005\u0007\u1007\u0006\b\u1004\u0007", new Object[] { "c", "d", "e", aqnr.e, "f", "g", aqnr.f, "h", "i" });
            }
            case 1: {
                if (o == null) {
                    k = 0;
                }
                this.k = k;
                return null;
            }
            case 0: {
                return this.k;
            }
        }
    }
}
