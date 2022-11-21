import com.google.protobuf.MessageLite;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aisa extends ahcz implements aheo
{
    public static final aisa a;
    private static volatile ahev d;
    public int b;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand c;
    private byte e;
    
    static {
        ahcz.registerDefaultInstance(aisa.class, a = new aisa());
    }
    
    private aisa() {
        this.e = 2;
    }
    
    @Override
    protected final Object dynamicMethod(final ahcy ahcy, final Object o, final Object o2) {
        final ahcy a = ahcy.a;
        final int ordinal = ahcy.ordinal();
        byte e = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahev d;
                if ((d = aisa.d) == null) {
                    synchronized (aisa.class) {
                        if (aisa.d == null) {
                            aisa.d = (ahev)new ahcs((ahcz)aisa.a);
                        }
                    }
                }
                return d;
            }
            case 5: {
                return aisa.a;
            }
            case 4: {
                return new ahcr((ahcz)aisa.a);
            }
            case 3: {
                return new aisa();
            }
            case 2: {
                return ahcz.newMessageInfo((MessageLite)aisa.a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u1409\u0000", new Object[] { "b", "c" });
            }
            case 1: {
                if (o == null) {
                    e = 0;
                }
                this.e = e;
                return null;
            }
            case 0: {
                return this.e;
            }
        }
    }
}
