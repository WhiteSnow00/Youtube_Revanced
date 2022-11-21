import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ammr extends ahcz implements aheo
{
    public static final ammr a;
    private static volatile ahev f;
    public int b;
    public String c;
    public long d;
    public boolean e;
    
    static {
        ahcz.registerDefaultInstance(ammr.class, a = new ammr());
    }
    
    private ammr() {
        this.c = "";
        ahcz.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        switch (ahcy.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev f;
                if ((f = ammr.f) == null) {
                    synchronized (ammr.class) {
                        if (ammr.f == null) {
                            ammr.f = (ahev)new ahcs((ahcz)ammr.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ammr.a;
            }
            case 4: {
                return new ahcr((ahcz)ammr.a);
            }
            case 3: {
                return new ammr();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)ammr.a, "\u0001\u0003\u0000\u000114\u0003\u0000\u0000\u00001\u1008\u00003\u1002\u00014\u1007\u0002", new Object[] { "b", "c", "d", "e" });
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
