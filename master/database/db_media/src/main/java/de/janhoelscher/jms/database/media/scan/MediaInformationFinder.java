package de.janhoelscher.jms.database.media.scan;

import de.janhoelscher.jms.database.media.MediaFile;

public interface MediaInformationFinder {

	public void findMediaInformation(MediaFile media);
}