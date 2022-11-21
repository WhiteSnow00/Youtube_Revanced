import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aigf extends ahcz implements aheo
{
    public static final aigf a;
    private static volatile ahev f;
    public int b;
    public String c;
    public String d;
    public String e;
    
    static {
        ahcz.registerDefaultInstance(aigf.class, a = new aigf());
    }
    
    private aigf() {
        this.c = "";
        this.d = "";
        this.e = "";
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
                if ((f = aigf.f) == null) {
                    synchronized (aigf.class) {
                        if (aigf.f == null) {
                            aigf.f = (ahev)new ahcs((ahcz)aigf.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aigf.a;
            }
            case 4: {
                return new ahcr((ahcz)aigf.a);
            }
            case 3: {
                return new aigf();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aigf.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
