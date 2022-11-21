import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogz extends ahcz implements aheo
{
    public static final aogz a;
    private static volatile ahev e;
    public int b;
    public int c;
    public String d;
    
    static {
        ahcz.registerDefaultInstance(aogz.class, a = new aogz());
    }
    
    private aogz() {
        this.d = "";
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
                if ((e = aogz.e) == null) {
                    synchronized (aogz.class) {
                        if (aogz.e == null) {
                            aogz.e = (ahev)new ahcs((ahcz)aogz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aogz.a;
            }
            case 4: {
                return new ahcr((ahcz)aogz.a);
            }
            case 3: {
                return new aogz();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aogz.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1008\u0001", new Object[] { "b", "c", aoha.b, "d" });
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
