import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aogl extends ahbh implements ahcw
{
    public static final aogl a;
    public static final ahbf b;
    private static volatile ahdd i;
    public int c;
    public aqfw d;
    public ajmm e;
    public boolean f;
    public boolean g;
    public CommandOuterClass$Command h;
    private amkn j;
    private ahcr k;
    private byte l;
    
    static {
        final aogl a2 = new aogl();
        ahbh.registerDefaultInstance((Class)aogl.class, (ahbh)(a = a2));
        b = ahbh.newSingularGeneratedExtension((MessageLite)CommandOuterClass$Command.getDefaultInstance(), (Object)a2, (MessageLite)a2, (ahbm)null, 221293762, ahek.k, (Class)aogl.class);
    }
    
    private aogl() {
        this.k = ahcr.a;
        this.l = 2;
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte l = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd i;
                if ((i = aogl.i) == null) {
                    synchronized (aogl.class) {
                        if (aogl.i == null) {
                            aogl.i = (ahdd)new ahba((ahbh)aogl.a);
                        }
                    }
                }
                return i;
            }
            case 5: {
                return aogl.a;
            }
            case 4: {
                return new ahaz((ahbh)aogl.a);
            }
            case 3: {
                return new aogl();
            }
            case 2: {
                return newMessageInfo((MessageLite)aogl.a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0001\u0000\u0003\u0001\u1409\u0000\u0002\u1409\u0001\u0003\u1007\u0002\u0005\u1007\u0004\u0006\u1009\u0005\u0007\u1409\u0006\b2", new Object[] { "c", "d", "e", "f", "g", "j", "h", "k", aogk.a });
            }
            case 1: {
                if (o == null) {
                    l = 0;
                }
                this.l = l;
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
