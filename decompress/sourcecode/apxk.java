import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apxk extends agzi implements ahax
{
    public static final apxk a;
    private static volatile ahbe f;
    public int b;
    public String c;
    public aioe d;
    public aioe e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(apxk.class, a = new apxk());
    }
    
    private apxk() {
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
                final ahbe f;
                if ((f = apxk.f) == null) {
                    synchronized (apxk.class) {
                        if (apxk.f == null) {
                            apxk.f = (ahbe)new agzb((agzi)apxk.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return apxk.a;
            }
            case 4: {
                return new agza((agzi)apxk.a);
            }
            case 3: {
                return new apxk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apxk.a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0002\u0001\u1008\u0000\u0004\u1409\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e" });
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
