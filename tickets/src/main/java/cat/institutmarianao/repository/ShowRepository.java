package cat.institutmarianao.repository;

import java.util.Collection;

import cat.institutmarianao.domain.Show;

public interface ShowRepository {
	Collection<Show> getAllShows();

	Show makeReservation(String showId);

	Show cancelReservation(String showId);
}
