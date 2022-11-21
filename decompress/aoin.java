import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoin extends ahcz implements aheo
{
    public static final aoin a;
    public static final ahcx b;
    private static volatile ahev i;
    public int c;
    public String d;
    public String e;
    public boolean f;
    public String g;
    public long h;
    
    static {
        final aoin a2 = new aoin();
        ahcz.registerDefaultInstance(aoin.class, a = a2);
        b = ahcz.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), a2, (MessageLite)a2, null, 262904603, ahgc.k, aoin.class);
    }
    
    private aoin() {
        this.d = "";
        this.e = "";
        this.g = "";
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev i;
                if ((i = aoin.i) == null) {
                    synchronized (aoin.class) {
                        if (aoin.i == null) {
                            aoin.i = (ahev)new ahcs((ahcz)aoin.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aoin.a;
            }
            case 4: {
                return new ahcr((ahcz)aoin.a);
            }
            case 3: {
                return new aoin();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aoin.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0004\u1007\u0003\u0005\u1008\u0004\u0006\u1003\u0005", new Object[] { "c", "d", "e", "f", "g", "h" });
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
