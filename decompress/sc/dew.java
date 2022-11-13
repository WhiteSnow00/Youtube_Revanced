// 
// Decompiled by Procyon v0.6.0
// 

final class dew extends RuntimeException
{
    private static final long serialVersionUID = -7530898992688511851L;
    
    public dew(final Throwable t) {
        super("Unexpected exception thrown by non-Glide code", t);
    }
}
