package tp7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;

public class DirMonitor {
	private Path path;
	
	public DirMonitor(Path path) throws IOException {
		if (!new File(path.toString()).isDirectory()) {
			throw new IOException("");
		}
		this.path = path;
	}
	
	public void ls() throws IOException {
		Iterator<Path> it = Files.newDirectoryStream(this.path).iterator();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	
	public long sizeOfFiles() throws IOException {
		long size = 0;
		Iterator<Path> it = Files.newDirectoryStream(this.path).iterator();
		while (it.hasNext()) {
			File file = new File(it.next().toString());
			if (file.isFile()) {
				size += file.length();
			}
		}
		return size;
	}
	
	public Path mostRecent() throws IOException {
		Iterator<Path> it = Files.newDirectoryStream(this.path).iterator();
		Path mostRecent = null;
		Path file;
		while (it.hasNext()) {
			file = it.next();
			if (mostRecent == null || mostRecent.toFile().lastModified() < file.toFile().lastModified()) {
				mostRecent = file;
			}
		}
		return mostRecent;
	}
	
}
