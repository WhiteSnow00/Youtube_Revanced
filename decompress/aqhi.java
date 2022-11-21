import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aqhi extends ahcz implements aheo
{
    public static final aqhi a;
    public static final ahcx b;
    private static volatile ahev j;
    public int c;
    public int d;
    public float e;
    public boolean f;
    public int g;
    public String h;
    public aqhg i;
    
    static {
        final aqhi a2 = new aqhi();
        ahcz.registerDefaultInstance(aqhi.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 281539545, ahgc.k, aqhi.class);
    }
    
    private aqhi() {
        this.f = true;
        this.h = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev j;
                if ((j = aqhi.j) == null) {
                    synchronized (aqhi.class) {
                        if (aqhi.j == null) {
                            aqhi.j = (ahev)new ahcs((ahcz)aqhi.a);
                        }
                    }
                }
                return j;
            }
            case 5: {
                return aqhi.a;
            }
            case 4: {
                return new ahcr((ahcz)aqhi.a);
            }
            case 3: {
                return new aqhi();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aqhi.a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1001\u0001\u0003\u1007\u0002\u0004\u100c\u0003\u0005\u1008\u0004\u0006\u1009\u0005", new Object[] { "c", "d", "e", "f", "g", aqdx.k, "h", "i" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
