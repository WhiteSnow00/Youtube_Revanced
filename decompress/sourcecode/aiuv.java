import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiuv extends agzi implements ahax
{
    public static final aiuv a;
    private static volatile ahbe k;
    public int b;
    public ajis c;
    public aiuw d;
    public ajpm e;
    public int f;
    public int g;
    public aiux h;
    public ajis i;
    public boolean j;
    private ankm l;
    
    static {
        agzi.registerDefaultInstance(aiuv.class, a = new aiuv());
    }
    
    private aiuv() {
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = aiuv.k) == null) {
                    synchronized (aiuv.class) {
                        if (aiuv.k == null) {
                            aiuv.k = (ahbe)new agzb((agzi)aiuv.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aiuv.a;
            }
            case 4: {
                return new agza((agzi)aiuv.a);
            }
            case 3: {
                return new aiuv();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiuv.a, "\u0001\t\u0000\u0001\u0001\r\t\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0004\u1009\u0003\u0006\u1009\u0005\b\u1004\b\t\u1004\u0006\n\u1009\t\f\u1009\n\r\u1007\u000b", new Object[] { "b", "c", "d", "l", "e", "g", "f", "h", "i", "j" });
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
