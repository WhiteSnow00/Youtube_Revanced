import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apja extends agzi implements ahax
{
    public static final apja a;
    private static volatile ahbe e;
    public int b;
    public apiz c;
    public String d;
    
    static {
        agzi.registerDefaultInstance(apja.class, a = new apja());
    }
    
    private apja() {
        this.d = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apja.e) == null) {
                    synchronized (apja.class) {
                        if (apja.e == null) {
                            apja.e = (ahbe)new agzb((agzi)apja.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apja.a;
            }
            case 4: {
                return new agza((agzi)apja.a);
            }
            case 3: {
                return new apja();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apja.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1008\u0001", new Object[] { "b", "c", "d" });
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
