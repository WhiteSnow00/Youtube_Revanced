import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amnz extends ahcz implements aheo
{
    public static final amnz a;
    private static volatile ahev e;
    public int b;
    public String c;
    public ahdp d;
    
    static {
        ahcz.registerDefaultInstance(amnz.class, a = new amnz());
    }
    
    private amnz() {
        this.c = "";
        this.d = ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev e;
                if ((e = amnz.e) == null) {
                    synchronized (amnz.class) {
                        if (amnz.e == null) {
                            amnz.e = (ahev)new ahcs((ahcz)amnz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return amnz.a;
            }
            case 4: {
                return new ahcr((byte[][])null, (char[])null);
            }
            case 3: {
                return new amnz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)amnz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1008\u0000\u0002\u001a", new Object[] { "b", "c", "d" });
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
