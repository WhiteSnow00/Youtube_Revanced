import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aodz extends agzi implements ahax
{
    public static final aodz a;
    private static volatile ahbe e;
    public ahas b;
    public String c;
    public aioe d;
    private int f;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(aodz.class, a = new aodz());
    }
    
    private aodz() {
        this.b = ahas.a;
        this.g = 2;
        this.c = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = aodz.e) == null) {
                    synchronized (aodz.class) {
                        if (aodz.e == null) {
                            aodz.e = (ahbe)new agzb((agzi)aodz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return aodz.a;
            }
            case 4: {
                return new agza((agzi)aodz.a);
            }
            case 3: {
                return new aodz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aodz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0000\u0001\u00012\u0002\u1008\u0000\u0003\u1409\u0001", new Object[] { "f", "b", aody.a, "c", "d" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}
