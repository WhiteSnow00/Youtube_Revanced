import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apjb extends agzi implements ahax
{
    public static final apjb a;
    private static volatile ahbe e;
    public int b;
    public agzy c;
    public apja d;
    
    static {
        agzi.registerDefaultInstance(apjb.class, a = new apjb());
    }
    
    private apjb() {
        this.c = agzi.emptyProtobufList();
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
                if ((e = apjb.e) == null) {
                    synchronized (apjb.class) {
                        if (apjb.e == null) {
                            apjb.e = (ahbe)new agzb((agzi)apjb.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apjb.a;
            }
            case 4: {
                return new agza((boolean[])null, (boolean[][])null);
            }
            case 3: {
                return new apjb();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apjb.a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\u1009\u0000", new Object[] { "b", "c", "d" });
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
