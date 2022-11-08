import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijz extends agzi implements ahax
{
    public static final aijz a;
    private static volatile ahbe e;
    public String b;
    public long c;
    public long d;
    private int f;
    
    static {
        agzi.registerDefaultInstance(aijz.class, a = new aijz());
    }
    
    private aijz() {
        this.b = "";
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
                if ((e = aijz.e) == null) {
                    synchronized (aijz.class) {
                        if (aijz.e == null) {
                            aijz.e = (ahbe)new agzb((agzi)aijz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aijz.a;
            }
            case 4: {
                return new agza((agzi)aijz.a);
            }
            case 3: {
                return new aijz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1002\u0002", new Object[] { "f", "b", "c", "d" });
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
