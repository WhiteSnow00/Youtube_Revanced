import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apkm extends agzi implements ahax
{
    public static final apkm a;
    private static volatile ahbe c;
    public agzy b;
    
    static {
        agzi.registerDefaultInstance(apkm.class, a = new apkm());
    }
    
    private apkm() {
        this.b = agzi.emptyProtobufList();
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe c;
                if ((c = apkm.c) == null) {
                    synchronized (apkm.class) {
                        if (apkm.c == null) {
                            apkm.c = (ahbe)new agzb((agzi)apkm.a);
                        }
                    }
                }
                return c;
            }
            case 5: {
                return apkm.a;
            }
            case 4: {
                return new agza((boolean[][][])null, (byte[][][])null);
            }
            case 3: {
                return new apkm();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apkm.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "b", apkl.class });
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
