import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aptn extends agzi implements ahax
{
    public static final aptn a;
    private static volatile ahbe f;
    public int b;
    public akxg c;
    public String d;
    public boolean e;
    
    static {
        agzi.registerDefaultInstance((Class)aptn.class, (agzi)(a = new aptn()));
    }
    
    private aptn() {
        this.d = "";
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe f;
                if ((f = aptn.f) == null) {
                    synchronized (aptn.class) {
                        if (aptn.f == null) {
                            aptn.f = (ahbe)new agzb((agzi)aptn.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return aptn.a;
            }
            case 4: {
                return new agza((agzi)aptn.a);
            }
            case 3: {
                return new aptn();
            }
            case 2: {
                return newMessageInfo((MessageLite)aptn.a, "\u0001\u0003\u0000\u0001\u0001\r\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0007\u1008\u0007\r\u1007\u000b", new Object[] { "b", "c", "d", "e" });
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
