import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class anke extends agzi implements ahax
{
    public static final anke a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public anjw d;
    public String e;
    
    static {
        agzi.registerDefaultInstance(anke.class, a = new anke());
    }
    
    private anke() {
        this.c = "";
        this.e = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = anke.f) == null) {
                    synchronized (anke.class) {
                        if (anke.f == null) {
                            anke.f = (ahbe)new agzb((agzi)anke.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return anke.a;
            }
            case 4: {
                return new agza((agzi)anke.a);
            }
            case 3: {
                return new anke();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)anke.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1009\u0001\u0003\u1008\u0002", new Object[] { "b", "c", "d", "e" });
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
